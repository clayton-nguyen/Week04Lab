package servlets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;


public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            if (request.getParameter("edit").equals("")) {
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            }
        }
        
        
        catch (Exception e) {
            String notePath = getServletContext().getRealPath("/WEB-INF/note.txt");
            
            BufferedReader buffRead = new BufferedReader(
                                        new FileReader(
                                            new File(notePath)));

            String titleField = buffRead.readLine();
            String contentField = buffRead.readLine();

            buffRead.close();

            Note note = new Note(titleField, contentField);

            getServletContext().setAttribute("note", note);
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String notePath = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        PrintWriter pWrite = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter(notePath, false)));

        String titleField = request.getParameter("titleInputArea");
        String contentField = request.getParameter("contentInputArea");

        pWrite.write(titleField + "\n");
        pWrite.write(contentField +"\n");

        pWrite.close();
        Note note = new Note(titleField, contentField);

        getServletContext().setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
