/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanager;

/**
 *
 * @author vclarido
 */
class CustomHashTable {
    private Node[] table;
    private int size;
    
    public CustomHashTable(int size) {
        this.size = size;
        table = new Node[size];
    }
    
    private int hash(String username) {
        // Simple hash function using Java's built-in hashCode
        return Math.abs(username.hashCode() % size);
    }
    
    public void insert(String username, String password) {
        int index = hash(username);
        Node newNode = new Node(username, password);
        
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            // Check if username already exists
            Node current = table[index];
            while (current != null) {
                if (current.username.equals(username)) {
                    current.password = password; // Update password if username exists
                    return;
                }
                if (current.next == null) break;
                current = current.next;
            }
            // Add new node at the end of the chain
            current.next = newNode;
        }
    }
    
    public boolean authenticate(String username, String password) {
        int index = hash(username);
        Node current = table[index];
        
        while (current != null) {
            if (current.username.equals(username) && current.password.equals(password)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            Node current = table[i];
            while (current != null) {
                System.out.print("(" + current.username + "," + current.password + ") -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
