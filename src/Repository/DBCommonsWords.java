package Repository;

public class DBCommonsWords {

    public static String[] db50MostCommonsWordsSpanish = {"que", "con", "por", "para", "una", "como", "sobre","archivo", "pruebas","este","Este"};


    public static boolean CompareWords(String toCompare, String[] dbWords) {
        boolean flag=false;
        for (int i = 0; i < dbWords.length; i++) {
            if (dbWords[i].equalsIgnoreCase(toCompare)||dbWords[i].toLowerCase().startsWith(toCompare)||dbWords[i].toLowerCase().endsWith(toCompare)) {
                flag=true;
                break;
            }

        }
        return flag;
      }
}
