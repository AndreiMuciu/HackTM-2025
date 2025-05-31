package ro.banatit.communitysync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        System.out.println(eventRepository.findAll());
        return eventRepository.findAll();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        System.out.println( "\n\nfkafh\n\n\n\n" + event);
        return eventRepository.save(event);
    }
}
