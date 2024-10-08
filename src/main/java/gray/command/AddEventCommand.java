package gray.command;

import java.time.LocalDateTime;

import gray.Tasks;
import gray.task.EventTask;

/**
 * A command that adds an event task.
 */
public class AddEventCommand implements Command {
    private final String description;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    /**
     * Constructs a command to add event task.
     *
     * @param description
     * @param startDate
     * @param endDate
     */
    public AddEventCommand(String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Executes the add event task.
     *
     * @param tasks
     * @return
     */
    public String execute(Tasks tasks) {
        EventTask task = new EventTask(description, startDate, endDate);
        tasks.add(task);
        return String.format("""
                Got it. I've added this task:
                    %s
                Now you have %d tasks in the list.""",
                task, tasks.size());
    }
}
