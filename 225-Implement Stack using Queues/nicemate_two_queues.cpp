/* Leetcode submission: https://leetcode.com/submissions/detail/642563419/
*/

#include <queue>


using namespace std;

class MyStack {
public:
    MyStack() {

    }

    ~MyStack() {

    }

    void push(int x) {
        collection.push(x);
    }

    int pop() {
        queue<int> inverse;
        int _size = collection.size();
        for(int i = 0; i < (_size-1); i++) {
            int el = collection.front();
            collection.pop();
            inverse.push(el);
        }
        
        for(int i = 0; i < (_size-1); i++) {
            collection.push(inverse.front());
            inverse.pop();
        }

        int t = collection.front();
        collection.pop();

        return t;
    }

    int top() {
        return collection.back();
    }

    bool empty() {
        return collection.empty();
    }

private:
    queue<int> collection;
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */