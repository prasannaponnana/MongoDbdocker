package com.stackroute.config;



    import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

    @Component
    @PropertySource("classpath:application.properties")
    class CommandLineRunner implements org.springframework.boot.CommandLineRunner{

        TrackRepository trackRepository;

        @Autowired
        private Environment environment;

   /* @Value("${spring.Track.trackId}")
    private int trackId;
    @Value("${spring.Track.trackName}")
    private String trackName;
    @Value("${spring.Track.trackComments}")
    private String trackComments;*/

        public CommandLineRunner(TrackRepository trackRepository) {
            this.trackRepository = trackRepository;
        }

        @Override
        public void run(String... args) throws Exception {
            Track track=new Track(Integer.parseInt(environment.getProperty("spring.Track.trackId1")),environment.getProperty("spring.Track.trackName1"),
                    environment.getProperty("spring.Track.trackComments1"));
            trackRepository.save(track);

        }
    }



