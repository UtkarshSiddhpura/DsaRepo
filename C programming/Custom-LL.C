/* 
	To use Linked List:
	 1) Create Head using createHead(valueForHead)
	 2) InsertNode using addNode(valueForNode)
	 or 
	 See E.g in main

	See Function Prototypes for more (no Docs they're self explanotory)
	HAPPY CODING!
*/ 

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct node
{
	int val;
	struct node *next;
};

// Function Prototypes
struct node* reverseList(struct node *node, struct node **memAddressOfHead); //pass initial node as head
void printList(struct node *head);
void addNode(struct node *head, int val);
struct node* createHead(int val);
struct node* getNode (int val);

// Main Function
int main () {
	// E.g
	int i;
	struct node *head = createHead(0);
	clrscr();

	for (i = 1; i <= 5; i++)
	{
		addNode(head, i);	
	}
	printList(head);
	getch();
	return 0;
}

struct node * reverseList(struct node *node, struct node **memAddressOfHead) {
	struct node *retNode;
	if (node->next == NULL) {
		// Now *head is pointing->last node (as reversing, so it'll become first now)
	    *memAddressOfHead = node;
		return node;
	}
	retNode = reverseList(node->next, memAddressOfHead);
	retNode->next = node;
	node->next = NULL;
	return node;
}

void printList(struct node *head) {
	// Changing Value of *head will not affect anything as it's a copy of original *head
	printf("start->");
	while(head->next != NULL) {
		printf("%d->", head->val);
		head = head->next;
	}
	printf("%d->", head->val);
	printf("end \n");
}

void addNode(struct node *head, int val) {
	struct node *newNode = getNode(val);
	while(head->next != NULL) {
		head = head->next;	
	}
	head->next = newNode;	
}

struct node* createHead(int val) {
	struct node *head = getNode(val);
	return head;
}

struct node* getNode (int val) {
	struct node *temp = (struct node*)(malloc(sizeof(int)));
	temp->val = val;
	return temp;
}

//  ---IGNORE BELOW--------------------------------------------
//  struct node* getNodeWithNext (int val, struct node *next) {
// 	struct node *temp = (struct node*)(malloc(sizeof(int)));
// 	temp->val = val;
// 	temp->next = next;
// 	return temp;
// }