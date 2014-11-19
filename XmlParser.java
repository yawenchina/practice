import java.util.*;

class Tokenizer {

	public Tokenizer(String xml) {

	}

	public static void main(String args[]) {
		ArrayList<Node> arr = new ArrayList<Node>();
		arr.add(new Node("videos", "open"));
		arr.add(new Node("video", "open"));
		arr.add(new Node("title", "open"));
		arr.add(new Node("EP1", "inner"));
		arr.add(new Node("title", "close"));
		arr.add(new Node("video", "close"));
		arr.add(new Node("video", "open"));
		arr.add(new Node("title", "open"));
		arr.add(new Node("EP2", "inner"));
		arr.add(new Node("title", "close"));
		arr.add(new Node("video", "close"));
		arr.add(new Node("book", "open"));

		arr.add(new Node("EP3", "inner"));

		arr.add(new Node("book", "close"));
		arr.add(new Node("videos", "close"));
		Stack<Node> m = new Stack<Node>();
		TreeNode temp = null;
		TreeNode pre = null;
		HashMap<String, TreeNode> map = new HashMap<String, TreeNode>();

		int i = 0;
		while (i < arr.size()) {
			if (arr.get(i).type == "open") {
				m.push(arr.get(i));
			} else {
				if (arr.get(i).type == "inner") {
					pre = new TreeNode(arr.get(i).value, arr.get(i + 1).value);
					// System.out.print(arr.get(i).value);
					// System.out.print(arr.get(i+1).value);

					m.pop();
				}
				while (!m.isEmpty() && arr.get(i).type == "close") {
					if (!map.containsKey(m.peek().value)) {
						temp = new TreeNode(m.peek().value);
					} else {
						temp = map.get(m.peek().value);
					}
					temp.children.add(pre);
					pre = temp;

					if (arr.get(i + 1).type == "close") {
						m.pop();
						i++;
					} else {
						if (!map.containsKey(m.peek().value)) {
							map.put(m.peek().value, pre);
						}
						break;
					}

				}

			}
			i++;
		}
		print(temp);
		dfs(temp, 0);
	}

	public static void dfs(TreeNode a, int number) {
		// hm[“videos”][“video”][1][“title”]
		if (a.children.size() == 0) {
			System.out.print("[" + a.child + "]");
			System.out.print("[" + a.value + "]");
			return;
		}
		System.out.print("[" + a.value + "]");
		if (number != 0 && a.children.size() != 0) {
			System.out.print("[" + number + "]");
		}
		for (int i = 0; i < a.children.size(); i++) {
			dfs(a.children.get(i), i + 1);
		}

	}

	public static void print(TreeNode a) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(a);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.println(temp.value);
			if (a.child != null) {
				System.out.println(a.child);
			}
			for (TreeNode t : temp.children) {
				// System.out.print("the value is "+t.value);
				q.offer(t);
			}
		}
	}

}

// string xml = “<videos><video><title>Ep 1</title></video><video><title>Ep
// 2</title></video></videos>”

