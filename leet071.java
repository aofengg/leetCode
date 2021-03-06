public class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
		Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
		for(String dir : path.split("/")) {
			if(dir.equals("..") && !stack.isEmpty())
				stack.pop();
			else if(!skip.contains(dir))
				stack.push(dir);
		}
		StringBuilder sb = new StringBuilder();
		for(String dir : stack) {
			sb.insert(0, dir);
			sb.insert(0, "/");
		}
		return sb.length() == 0 ? "/" : sb.toString();
    }
}