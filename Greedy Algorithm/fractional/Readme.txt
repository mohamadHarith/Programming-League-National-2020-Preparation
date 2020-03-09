How this greedy method is done:

1. Sort the items by val/weight ratio. This will make each item in the array starting from item 0 to be of the highest value.
    EXAMPLE:

    #Before sorting - Item arr[] = {{100, 20}, {60, 10}, {120, 30}};
    item        value/weight ratio
    arr[0] :    5
    arr[1] :    6
    arr[2] :    4
    #After sorting - Item arr[] = {{60, 10}, {100, 20}, {120, 30}};
    item        value/weight ratio
    arr[0] :    6
    arr[1] :    5
    arr[2] :    4

2. Take items starting with arr[0] until you cannot take with full weight.
    ***Note: Because array already sorted so, naturally the first item is always of highest value. Next item in array will be of second highest value and so on...
    EXAMPLE:
    max weight: 50
            item    value   weight
            arr[0]  60      10
            arr[1]  100     20
            arr[2]  120     30 <--- *Notice how this item cannot be added to the weight because it will exceed. 30 + 30 = 60
            ------------------
    total           160     30

3. Take fractional items of the 3rd item or last item.
    EXAMPLE:
    max weight: 50
            item    value   weight
            arr[0]  60      10
            arr[1]  100     20
            ------------------
    total           160     30 <--- remaining weight is 20, 50-30=20

    20 weight of arr[2], 20(weight) * 4(value/weight ratio) = 80
    max weight: 50
            item    value   weight
            arr[0]  60      10
            arr[1]  100     20
            arr[2]  80      30
            ------------------
    total           240     50 <--- MAX WEIGHT ACHIEVED




    