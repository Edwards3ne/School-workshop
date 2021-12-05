package BlogPost;

public class main {
    public static void main(String[] args) {
        BlogPost harry =new BlogPost("Rowling","Harry Potter","Harry knows hes death",
                "1.1.2021");
        BlogPost harry2 =new BlogPost("Rowling","Harry Potter2","Harry knows hes death again",
                "1.1.2022");
        Blog kidsBooks = new Blog();
        kidsBooks.add(harry);
        System.out.println(kidsBooks.BlockList.get(0));
        kidsBooks.update(0,harry2);
        System.out.println(kidsBooks.BlockList.get(0));

    }
}
