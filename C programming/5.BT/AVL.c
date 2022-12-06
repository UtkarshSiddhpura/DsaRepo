struct node {
    int val;
    struct node *left;
    struct node *right;
};

struct node *addNode(struct node* node, int val) {
    if (node == NULL) {
        node = getNode(val);
        return node;
    }
    
    if (val <= node->val) {
        node->left = addNode(node->left, val);
    } else {
        node->right = addNode(node->right, val);
    }
    return node;
}

int getRightHeight(struct node *node) {
	if (node == NULL) return;
	int height = 1;
	while (node.right != NULL) {
		node = node->right;
		height++;
	}
	if (node->left != NULL) {
		
	}
}
int getLeftHeight(struct node *node) {

}

int getHeightDiff(struct node* node) {
	return getRightHeight(node) - getLeftHeight(node);	
}

int main()
{
    return 0;
}