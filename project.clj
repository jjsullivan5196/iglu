(defproject iglu "0.10.0-SNAPSHOT"
  :description "A Clojure data -> GLSL library"
  :url "https://github.com/oakes/iglu"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :sign-releases false}]]
  :profiles {:dev {:main iglu.core}})
