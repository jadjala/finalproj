/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanager;

/**
 *
 * @author vclarido
 */
    class Node {
    String username;
    String password;
    Node next;
    
    public Node(String username, String password) {
        this.username = username;
        this.password = password;
        this.next = null;
    }
}
