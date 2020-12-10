package task_string;

public class Main {

    public static void main(String[] args) {
        CountText temp = new CountText();
        String str="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium , totam rem aperiam , eaque ipsa quae abba illo inventore veritatis et quasi architecto beatae vitae    dicta sunt explicabo . Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit , sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt . Neque porro quisquam est , qui dolorem ipsum quia dolor   sit /// amet , consectetur , adipisci velit , sed quia non   numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat volupulov . Ut enimine ad minimaamInim veniam , quisiuq nostrum exercitationem ullam corporis suscipit laboriosam , nisi ut aliquid ex ea commodi consequatur ? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur , vel illum qui dolorem eum fugiat quo voluptas ? nuLlun ? pariatur ?";
        str = str.replaceAll("[^a-zA-Z ]", "");
        System.out.println(str);
        System.out.println(temp.Number_Of_Char(str,"v"));
        System.out.println(temp.Number_World_Of_Char(str,"v"));
        System.out.println((temp.Number_World_First_Last(str,'v','m')));
        System.out.println(temp.PolidromInfo(str));
        temp.Polidrom(str);
    }
}
