//Gobardhan Meher

#include<bits/stdc++.h>
using namespace std;


#define ll long long
#define nline "\n"

class Node{
    public:
    int data;
    Node* next;

    public:
    Node(int data1){
        data = data1;
        next = nullptr;
    }

    public:
    Node(int data1, Node* next1){
        data = data1;
        next = next1;
    }
};

void print(Node* head){
    while(head){
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int lenOfLL(Node* head){
    int ct = 0;
    while(head){
        ct += 1;
        head = head->next;
    }
    return ct;
}

Node* convertArrToLL(vector<int>& v, Node* head){
    Node* mover = head;
    for(int i = 1; i < v.size(); i++){
        Node* n = new Node(v[i], nullptr);
        mover->next = n;
        mover = n;
    }

    return head;
}

int main() {
    vector<int> v = {2,5,3,6,9};
    Node* head = new Node(v[0]);
    convertArrToLL(v, head);

    print(head);
    print(head);
    cout << lenOfLL(head) << endl;
    
    return 0;
}
