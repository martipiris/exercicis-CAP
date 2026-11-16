(require '[clojure.string :as string])

(defn parlarn [animal cops]
  (->> 
   (for [_ (range cops)] (animal))
   (string/join " ")
   ))

(defn animal [] 
  (fn retorna []
    "grr")
  )

(defn gat [base] 
  (fn retorna []
    "mèu")
  )

(defn tigre [base]
  (fn retorna []
    (base))
  )

