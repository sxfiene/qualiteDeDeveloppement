package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void uneVoiture(){
        Voiture voiture = Mockito.mock(Voiture.class); // new Voiture();
        voiture.setMarque("Peugeot");
        voiture.setPrix(10000);
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));
        when(voitureRepository.findById(1)).thenReturn(java.util.Optional.of(voiture));
        when(voitureRepository.save(voiture)).thenReturn(voiture);
        when(voitureRepository.saveAll(Collections.singletonList(voiture))).thenReturn(Collections.singletonList(voiture));
        when(voitureRepository.count()).thenReturn(1L);
        when(voitureRepository.existsById(1)).thenReturn(true);
        when(voitureRepository.count()).thenReturn(1L);
        when(voitureRepository.existsById(1)).thenReturn(true);
    }
}
