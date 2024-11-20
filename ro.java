import random as r

lst = [0]*10
for in range(100):
lst[i]=r.randint(1,100)
print ("Randomized generated list:", lst)

def push (stack, item, top)
    top += 1;
    stack[top] = item;
    return top;
    
def pop (stack, top)
    if top >=0;
    top -= 1;
    return top;

def nearest_smaller_num_on_left(arr) 
    result = ["_"]*len(arr);
    stack = [0]*len(arr);
    top = -1;

for i in range (len(arr))
    num = arr[i]

while top >= 0 and stack [top] >=num {
     top = pop(stack, top);
}

if top >=0:
    result [i] stack[top];
    top = push(stuck,num,top);

    return result;

nearest_left = nearest_smaller_num_on_left(lst);
print ("Nearest smaller number on the left:", nearest_left)