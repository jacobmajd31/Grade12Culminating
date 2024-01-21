
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.Comparator;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cheransankaran
 */
public class TaskiListFrame extends javax.swing.JFrame {

    /**
     * Creates new form TaskiListFrame
     */
    
    public TaskiListFrame() {
        initComponents();
    }
    

        List<Task> tasks = readTasksFromFile("masterTaskList.txt");

        // Print the tasks
        
        public static List<Task> readTasksFromFile(String filePath) {
        List<Task> tasks = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String name = line;
                int timeAllocated = Integer.parseInt(reader.readLine());
                String status = reader.readLine();
                LocalDate dueDate = LocalDate.parse(reader.readLine());
                String description = reader.readLine();

                // Create Task object and add to the list
                Task task = new Task(name, timeAllocated, status, dueDate, description);
                tasks.add(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tasks;
    }
        
         public static void recursiveMergeSort(List<Task> tasks, boolean ascending) {
        if (tasks.size() > 1) {
            int mid = tasks.size() / 2;

            List<Task> left = new ArrayList<>(tasks.subList(0, mid));
            List<Task> right = new ArrayList<>(tasks.subList(mid, tasks.size()));

            recursiveMergeSort(left, ascending);
            recursiveMergeSort(right, ascending);

            merge(tasks, left, right, ascending);
        }
    }
         private static void merge(List<Task> tasks, List<Task> left, List<Task> right, boolean ascending) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if ((ascending && left.get(i).compareTo(right.get(j)) <= 0) ||
                (!ascending && left.get(i).compareTo(right.get(j)) >= 0)) {
                tasks.set(k++, left.get(i++));
            } else {
                tasks.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            tasks.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            tasks.set(k++, right.get(j++));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTaskListDisplay1 = new javax.swing.JTextArea();
        btmSelectTask = new javax.swing.JToggleButton();
        txtSelectTask = new javax.swing.JTextField();
        btnReturnhome = new javax.swing.JButton();
        btnSortAscending = new javax.swing.JButton();
        btnSortDescending = new javax.swing.JButton();
        lblSortingDirections = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTaskListDisplay2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTaskListDisplay3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblStatusOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTaskListDisplay1.setColumns(20);
        txtTaskListDisplay1.setRows(5);
        jScrollPane1.setViewportView(txtTaskListDisplay1);

        btmSelectTask.setText("SelectTask");
        btmSelectTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSelectTaskActionPerformed(evt);
            }
        });

        btnReturnhome.setText("Back");
        btnReturnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnhomeActionPerformed(evt);
            }
        });

        btnSortAscending.setText("Ascending");
        btnSortAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortAscendingActionPerformed(evt);
            }
        });

        btnSortDescending.setText("Descending");
        btnSortDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDescendingActionPerformed(evt);
            }
        });

        lblSortingDirections.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSortingDirections.setText("Sorting Direction");

        txtTaskListDisplay2.setColumns(20);
        txtTaskListDisplay2.setRows(5);
        jScrollPane2.setViewportView(txtTaskListDisplay2);

        txtTaskListDisplay3.setColumns(20);
        txtTaskListDisplay3.setRows(5);
        jScrollPane3.setViewportView(txtTaskListDisplay3);

        jLabel1.setText("Not Started");

        jLabel2.setText("Started");

        jLabel3.setText("Completed");

        jLabel4.setText("Sorting tasks based on date: ");

        jLabel5.setText("Select specfic task to display information on seperate page: ");

        lblStatusOutput.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btmSelectTask)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnReturnhome)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSelectTask, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(183, 183, 183)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSortAscending)
                                .addGap(56, 56, 56)
                                .addComponent(btnSortDescending))
                            .addComponent(lblSortingDirections, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblStatusOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSortingDirections)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortAscending)
                    .addComponent(btnSortDescending)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(50, 50, 50)
                .addComponent(lblStatusOutput)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSelectTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btmSelectTask)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturnhome)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnhomeActionPerformed
        
                FileWriter myWriter = null;
      
        try {
            // TODO add your handling code here:
            myWriter = new FileWriter("masterTaskList.txt");
            myWriter.write("");
            for (int i = 0;i < tasks.size();i++){
                myWriter.write(tasks.get(i).toString());
                
            }   
            MainPage myFrame1 = new MainPage();
            myFrame1.show();
            dispose();
            //FileWriter myWriter = new FileWriter("masterTaskList.txt");
        } catch (IOException ex) {
            Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
        
    }//GEN-LAST:event_btnReturnhomeActionPerformed

    private void btnSortAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortAscendingActionPerformed
       
// ...
        recursiveMergeSort(tasks, true);
        FileWriter myWriter = null;

        try {
            myWriter = new FileWriter("masterTaskList.txt");
            myWriter.write("");

            // Sort tasks by due date in ascending order
            tasks.sort(Comparator.comparing(Task::getDueDate));

            // Loop through sorted tasks and append each task's name and due date to the corresponding text area
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String taskInfo = task.getName() + " - Due Date: " + task.getDueDate() + "\n";

                // Determine which text area to append to based on the task's status
                switch (task.getStatus()) {
                    case "Not Started":
                        txtTaskListDisplay1.append(taskInfo);
                        break;
                    case "Started":
                        txtTaskListDisplay2.append(taskInfo);
                        break;
                    case "Completed":
                        txtTaskListDisplay3.append(taskInfo);
                        break;
                    default:
                        // Handle unexpected status values if necessary
                        break;
                }
            }

            // FileWriter myWriter = new FileWriter("masterTaskList.txt");
        } catch (IOException ex) {
            Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (myWriter != null) {
                    myWriter.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        lblStatusOutput.setText("Tasks displayed by due date and status");
    }//GEN-LAST:event_btnSortAscendingActionPerformed

    private void btnSortDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDescendingActionPerformed
        recursiveMergeSort(tasks, false);
        FileWriter myWriter = null;
      
        try {
            // TODO add your handling code here:
            myWriter = new FileWriter("masterTaskList.txt");
            myWriter.write("");
            for (int i = 0;i < tasks.size();i++){
                myWriter.write(tasks.get(i).toString());
                
            }   
            //FileWriter myWriter = new FileWriter("masterTaskList.txt");
        } catch (IOException ex) {
            Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(AddTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lblStatusOutput.setText("sorted in descending order");
    }//GEN-LAST:event_btnSortDescendingActionPerformed

    private void btmSelectTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSelectTaskActionPerformed
      String searchTaskName = txtSelectTask.getText();  // Replace with the actual task name you want to search for

        Task foundTask = searchTaskByName(searchTaskName);

        if (foundTask != null) {
            System.out.println("Task found: " + foundTask);
            writeTaskDetailsToFile(foundTask, "tempTask.txt");
            TaskPageFrame myFrame3 = new TaskPageFrame();
            myFrame3.show();
            dispose();
        } else {
            lblStatusOutput.setText("Task not found with name: " + searchTaskName);
        }

    }//GEN-LAST:event_btmSelectTaskActionPerformed

        private static void writeTaskDetailsToFile(Task task, String filename) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write(task.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public Task searchTaskByName(String name) {
    for (Task task : tasks) {
        if (task.getName().equals(name)) {
            return task;
        }
    }
    return null;
}

    
    public static void main(String args[]) throws FileNotFoundException, IOException{
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskiListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskiListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskiListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskiListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskiListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btmSelectTask;
    private javax.swing.JButton btnReturnhome;
    private javax.swing.JButton btnSortAscending;
    private javax.swing.JButton btnSortDescending;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSortingDirections;
    private javax.swing.JLabel lblStatusOutput;
    private javax.swing.JTextField txtSelectTask;
    private javax.swing.JTextArea txtTaskListDisplay1;
    private javax.swing.JTextArea txtTaskListDisplay2;
    private javax.swing.JTextArea txtTaskListDisplay3;
    // End of variables declaration//GEN-END:variables
}
