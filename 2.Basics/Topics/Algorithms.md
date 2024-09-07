Bloom filters 

![false-pos-false-neg.png](./false-pos-false-neg.png)

-> can report false positives, but can never report false negative. 


User likes ribeye and potato and doesn't like pork chop.
This case gives us correct result.
![Bloom filter true negative](bloom-filter-true-negative.png)


User doesn't like lemon but the bloom filter denotes it likes lemon.
![Bloom filter false positive](bloom-filter-false-positive.png)

But the case can never happen where user likes something and it doesn't return the result as negative.

Hence false negatives cannot happen.


That's why for searching in a large data we can use bloom filters.