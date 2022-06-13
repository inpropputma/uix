(ns uix.test-runner
  (:require [clojure.test :refer :all]
            [uix.core-test]
            [uix.compiler.alpha-test]
            [uix.hooks-test]
            [uix.ssr-test]
            [uix.xframe-test]
            [uix.aot-test]))

(defn -main [& args]
  (run-tests
    #_'uix.ssr-test
    'uix.core-test
    'uix.compiler.alpha-test
    'uix.hooks-test
    'uix.aot-test
    'uix.xframe-test))
