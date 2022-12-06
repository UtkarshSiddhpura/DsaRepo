// Binary Tree implementation in c using Arrays
#include <stdio.h>
#include <stdlib.h>

struct tree {
    int* arr;  
    int end;  
    int size;
};

struct tree* initTree(int size) {
    struct tree* tree = malloc(sizeof(struct Tree*));
    // [X, 1, 2, 3, 4, 5, 6, 7] -> first index arr not zeroth
    tree->arr = malloc((size+1)*sizeof(int));
    tree->end = 0;
    tree->size = size;
    return tree;
}

void addNode(struct tree* tree, int val) {
    if (tree->end == tree->size) {
        printf("Tree is full\n"); 
        return;
    }
    tree->end++;
    tree->arr[tree->end] = val;
}

void levelOrder(struct tree* tree) {
    for (int i = 1; i <= tree->end; i++) {
        printf("%d, ", tree->arr[i]);
    } 
    printf("\n");
}

void printTree(struct tree* tree) {
    for (int i = 0; i < tree->size; i++) {
        for (int j = 0; j < 2; j++) {
            
        }
    }
}

int main()
{
    struct tree *tree = initTree(3);
    addNode(tree, 25);
    addNode(tree, 35);
    addNode(tree, 15);
    levelOrder(tree);
    return 0;
}
