package ro.banatit.communitysync;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity //use Lombok ce genereaza toate metodele necesare
@Table(name = "events")
@Data // Generează automat getteri, setteri, toString, equals și hashCode
@NoArgsConstructor // Generează constructor implicit
@AllArgsConstructor // Generează constructor cu toate câmpurile
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String organizer;
}