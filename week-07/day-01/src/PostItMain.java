import Animal.Animal;
import BlogPost.BlogPost;
import Postit.PostIt;
import Sharpie.Sharpie;

public class PostItMain {


    public static void main(String[] args) {
        //Post It
        PostIt post1 = new PostIt("orange","Idea 1","blue");
        PostIt post2 = new PostIt("pink","Awesome","black");
        PostIt post3 = new PostIt("yellow","Superb!","green");

        //Blog post
        BlogPost blog1=new BlogPost("John Doe","Lorem Ipsum","Lorem ipsum dolor sit amet.",
                "2000.05.04.");
        BlogPost blog2=new BlogPost("Tim Urban","Lorem Ipsum","A popular long-form," +
                " stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");
        BlogPost blog3=new BlogPost("William Turton","One Engineer Is Trying to Get IBM to" +
                " Reckon With Trump","Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center" +
                " of attention. When I asked to take his picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer profile thing.",
                "2000.05.04.");

        //Animal.Animal
        Animal dog=new Animal();
        dog.play();
        System.out.println(dog.getHunger());
        dog.eat();
        System.out.println(dog.getHunger());

        //Sharpie.Sharpie
        Sharpie titanic= new Sharpie("black",150.35);
        System.out.println(titanic.getInkAmount());
        titanic.use();
        System.out.println(titanic.getInkAmount());
    }


}
