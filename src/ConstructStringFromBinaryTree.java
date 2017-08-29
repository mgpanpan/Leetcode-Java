public class ConstructStringFromBinaryTree {
//    public String tree2str(TreeNode t) {
//        String result = "";
//        if (t == null) return result;
//        result = result.concat(Integer.toString(t.val));
//        if (t.left == null && t.right == null) return result;
//
//        result = result.concat("(");
//        if (t.left != null) {
//            result = result.concat(tree2str(t.left));
//        }
//        result = result.concat(")");
//
//        if (t.right != null) {
//            result = result.concat("(");
//            result = result.concat(tree2str(t.right));
//            result = result.concat(")");
//        }
//
//        return result;
//    }

    public String tree2str(TreeNode t) {
        StringBuilder result = new StringBuilder("");
        if (t == null) return result.toString();
        result.append(Integer.toString(t.val));
        if (t.left == null && t.right == null) return result.toString();

        result.append("(");
        if (t.left != null) {
            result.append(tree2str(t.left));
        }
        result.append(")");

        if (t.right != null) {
            result.append("(");
            result.append(tree2str(t.right));
            result.append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "";
        a.concat("hello");
        System.out.println(a);
    }

}
