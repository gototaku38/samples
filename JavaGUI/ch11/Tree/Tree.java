/*
 * Tree.java
 */
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame {

    JTree tree = null;
    JLabel lbl = new JLabel("ノードをクリック!");

    Tree() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Top node");
        tree = new JTree(top);
        tree.addTreeSelectionListener( new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
		        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
	                       tree.getLastSelectedPathComponent();
	            if (node == null) // 何も選択されていない
	                    return;
	            if (node.isLeaf()) {
                    lbl.setText(node.toString());
                } else {
                    lbl.setText("子ノードがあります:" + node.toString());
                }
			}
        });

        DefaultMutableTreeNode sub1 =
        		new DefaultMutableTreeNode("これはサブノード1です。");
        top.add(sub1);
        DefaultMutableTreeNode sub2 =
        		new DefaultMutableTreeNode("これはサブノード2です。");
        top.add(sub2);
        DefaultMutableTreeNode sub11 =
        		new DefaultMutableTreeNode("これはサブサブノード。");
        sub1.add(sub11);
        DefaultMutableTreeNode sub12 =
        		new DefaultMutableTreeNode("これはサブサブノード。");
        sub1.add(sub12);
        tree.expandRow(0);
        this.setLayout( new BorderLayout() );
        this.add(tree, "Center");
        this.add(lbl, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tree");
        setSize(320, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tree();
    }
}
