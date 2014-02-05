(ns programming-challenges.core
  (:require [programming-challenges.Problem1 :as problem1]))


(defn readline [& prompt-message]
  (if-not (empty? prompt-message)(println prompt-message))
  (read-line))


(defn readmultiline [& prompt-message]
  (println prompt-message)
  (let [result []]
    (loop [value (readline)]
      (when-not (= value "done")
        (do
          (conj result 1)
          (recur (readline)))))
    result))


(defn-  main
  [& args]
  (problem1/start))

(main [])