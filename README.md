# clojure-scad-3d-modeling

Inspired by Matt Adereth's [talk](https://youtu.be/uk3A41U0iO4) about building a keyboard using Clojure.

Using [scad-clj](https://github.com/farrellm/scad-clj) wrapper to do 3d modeling.

## Installation

- install [Clojure runtime](https://clojure.org/guides/getting_started)
- install [Leiningen](https://leiningen.org/)
- install [OpenSCAD](https://openscad.org/)

## Usage

1. run `lein repl :headless` in the terminal
2. `M-x cider-connect` to connect with the repl and evaluate code

(or use any tool you like to work in the repl)

open OpenSCAD and open the scad file you spit out, by evaluating code in the repl and write to the scad file, the 3d model will be updated automatically.

## Examples
- [mobius ring](/src/mobius.clj)
- [Gatheround logo](/src/gatheroun.clj)
