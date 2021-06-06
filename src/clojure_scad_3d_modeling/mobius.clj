(ns scad-demo.core
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

;; from Matt Adereth talk https://youtu.be/uk3A41U0iO4

(defn pair-hulls [shapes]
  (apply union
         (map hull (partition 2 1 shapes))))

(def mobius
  (pair-hulls
   (for [p (range 0 1.01 0.01)] ;last parameter is the resolution
     (->> (cylinder 1 10)
          (rotate (* Math/PI p) [1 0 0])
          (translate [0 25 0])
          (rotate (* 2 Math/PI p) [0 0 1])))))

(spit "mobius.scad"
      (write-scad mobius))
