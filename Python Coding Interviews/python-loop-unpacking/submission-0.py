from typing import List, Tuple


def best_student(scores: List[Tuple[str, int]]) -> str:
    high =0
    name=""
    for s in scores:
        th,tn = s[1],s[0]
        if th >high:
            high = th
            name =tn
    return name




# do not modify below this line
print(best_student([("Alice", 90), ("Bob", 80), ("Charlie", 70)]))
print(best_student([("Alice", 90), ("Bob", 80), ("Charlie", 100)]))
print(best_student([("Alice", 90), ("Bob", 100), ("Charlie", 70)]))
print(best_student([("Alice", 90), ("Bob", 90), ("Charlie", 80), ("David", 100)]))
