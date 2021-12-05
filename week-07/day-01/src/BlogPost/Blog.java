package BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    ArrayList<BlogPost> BlockList=new ArrayList<BlogPost>();

    public List add(BlogPost blogPost){
        BlockList.add(blogPost);
        return BlockList;
    }
    public List delete(int index){
        BlockList.remove(index);
        return BlockList;
    }
    public List update(int index,BlogPost blogPost){
        BlockList.set(index,blogPost);
        return BlockList;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "BlockList=" + BlockList.toString() +
                '}';
    }
}
