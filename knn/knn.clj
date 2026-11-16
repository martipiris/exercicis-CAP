(defn pairs [v w]
  (for [i (range (count v))] [(get v i) (get w i)])
 )

(defn de [v w]
  (->>
   (pairs v w)
   (reduce (fn [result pair]
             (let [[vi wi] pair
                   diff (- vi wi)]
               (+ result (* diff diff))))
           0.0)
   (Math/sqrt)))
   
(defn dm [v w]
  (->>
   (pairs v w)
   (reduce (fn [result pair]
             (let [[vi wi] pair]
               (+ result (abs (- vi wi))))
             ) 0.0)
   )
  )

(defn dh [v w]
  (/ (->>
      (pairs v w)
      (reduce (fn [result pair]
                (let [[vi wi] pair]
                  (if (= vi wi)
                    result
                    (inc result)))) 0))
     (count v))
  )