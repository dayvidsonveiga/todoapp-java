
package TodoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;


public class Main {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
                
        project.setId(1);
        project.setName("Novo nome do projeto");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos: " + projects.size());
        
        projectController.removeById(1);
        
    }
    
}
