(ns scad-demo.core
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(def shape-order
  [5 4 6 720])

(def gatheround
  (difference
   (binding [*fn* 720]
     (->>
      (circle 60)
      (extrude-linear {:height 10 :center false})))
   (union
    (let [r 10]
      (for [s (range 8)]
        (binding [*fn* (nth shape-order (mod s 4))]
          (->>
           (circle r)
           (rotate (* Math/PI 0.5) [0 0 1])
           (translate [(* (* r 4) (Math/cos (* (* 2 Math/PI) (* s 0.125))))
                       (* (* r 4) (Math/sin (* (* 2 Math/PI) (* s 0.125))))
                       10])
           (extrude-linear {:height 10 :center false}))))))))

(spit "gatheround.scad"
        (write-scad gatheround))
