package com.octo.rdo.enzo.mobday.controllers.liste

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Suppress("unused")
class ListeConsultantController {
    @RequestMapping("/listeDesGens", method = [RequestMethod.GET])
    fun listeDesGens(): List<Consultant> = listOf(
        Consultant(
            id = "1",
            competences = listOf(),
            nom = "AKAR",
            prenom = "Paul",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLFwAYUWD9MYkhD_WfaazHUPLxsDojr0u3ClIRrAMl-n3N5A-Q",
            email = "paul.akar@octo.com",
            niveau = "Senior Partner",
            tjm = 3000,
        ),
        Consultant(
            id = "2",
            competences = listOf(),
            nom = "CHABIN",
            prenom = "Quentin",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocK2tR8uQ1yfFbsqttOu1RkaESpfZ7MXZ5Z6EGpr6Afbew",
            email = "quentin.chabin@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "3",
            competences = listOf<String>(),
            nom = "CENS",
            prenom = "Adrien",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLej_RpKTtABJ2MPQb-DqdB9NeRqB-vl31yE4ev_JWj2s31NAs",
            email = "adrien.cens@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "4",
            competences = listOf<String>(),
            nom = "VINCENT",
            prenom = "Sylvain",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocK1QWeGVfKeu7HsMuda6n-KAK5jfEBwA_DJ8U9LF-EJsw",
            email = "sylvain.vincent@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "5",
            competences = listOf<String>(),
            nom = "SUN",
            prenom = "Jiaji",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocJC0Ela3qdYLSQ02mKfq5MxDI9x6NSoEEXTXyZFoBFr2Q",
            email = "jiaji.sun@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "6",
            competences = listOf<String>(),
            nom = "SABATIE",
            prenom = "Guillaume",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocINK1LPOyAKDF3SH9P0pq-8wLC65-SHN1GCC0T615ZR",
            email = "guillaume.sabatie@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "7",
            competences = listOf<String>(),
            nom = "ROGIER",
            prenom = "Eddy",
            photo = "https://lh3.googleusercontent.com/a/AAcHTtcgCSJYi8XEz-wwJgde5YhB4CSsqoMu3BB4ALUsK6o",
            email = "eddy.rogier@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "8",
            competences = listOf<String>(),
            nom = "PATEL",
            prenom = "Pritesh",
            photo = "https://lh3.googleusercontent.com/a/AEdFTp5NIV240Z8Gi6_Ax4z83bA_qlC5UeKbDu0PQxw7",
            email = "pritesh.e.patel@octo.com",
            tjm = 2500,
            niveau = "Junior Partner"
        ),
        Consultant(
            id = "9",
            competences = listOf<String>(),
            nom = "MEYER",
            prenom = "Mathieu",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocILl1KOwgOvhDhsE1s0AG1-Tg1DeljGmmFBWOYFo2OW2NA",
            email = "mathieu.meyer@octo.com",
            tjm = 2500,
            niveau = "Junior Partner"
        ),
        Consultant(
            id = "10",
            competences = listOf<String>(),
            nom = "MELIKIAN",
            prenom = "Jean-Christophe",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLG9F20X7N6IcwuYQtRi0SC6iEPfcKS6bdRNL4S2hQA",
            email = "j.melikian@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "11",
            competences = listOf<String>(),
            nom = "FOREST",
            prenom = "Thibault",
            photo = "https://lh3.googleusercontent.com/a/AGNmyxZpdVy2bcax9JBcIeFm7VwogDTMoWYJlS0Ijc_o",
            email = "thibault.forest@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "12",
            competences = listOf<String>(),
            nom = "CHAPUY",
            prenom = "Jordan",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocIN7Fs4_fIvO3yCP5sRQO6fkuB-QIkopTiAYKN3BRjGKg",
            email = "jordan.chapuy@octo.com",
            tjm = 500,
            niveau = "Développeur Apprenti"
        ),
        Consultant(
            id = "13",
            competences = listOf<String>(),
            nom = "GERMAIN",
            prenom = "Théo",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLI5aRiOAuXRz_Fr9PTopenO9jQJNvrScT4MzLloqFSfcW8WFk",
            email = "theo.germain@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "14",
            competences = listOf<String>(),
            nom = "CALVINO",
            prenom = "Enzo",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocI04-MIyeYgjWqYCPIV4K0qby9Jx3F5-y1Gp2k_7huv2_1PuvM",
            email = "enzo.calvino@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "15",
            competences = listOf<String>(),
            nom = "FONTAINE",
            prenom = "Alban",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocKN7k-k04ztaX0HFN3kj7u7VYGeeuICnxwTP0K-cJ9pGg",
            email = "alban.fontaine@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "16",
            competences = listOf<String>(),
            nom = "HERRADOR",
            prenom = "Lucas",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocKmDfgyiuMsMZiEPI3tkuGvH3Yl9yv3UoG1hRxOhnQg0A",
            email = "lucas.herrador@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "17",
            competences = listOf<String>(),
            nom = "YE",
            prenom = "Ziyu",
            photo = "https://lh3.googleusercontent.com/a-/ALV-UjUfBsCQR_whtU9ocdggLBTXu6NmGqCxefg-c9XkTUfrojvYJ6_pcIG97ytcx90wquqtnTP2BqTv61oWr4C-gaphc0fR74K49m0n1HiLRfE_hAzrUIGz37VxuROt6bLOE4M3Ix5UV0r5ZoDNrmT0vFncEbf1UaMiZHEkHr_ks-nKHkAw0qVMed32WVbxP74Vgu-ycqOpt2GmK_LNNTutHT-iotb1acCY7AuYjaTFrWEZlm89oCygzLEci0Kk7kvGgb0P2uK0zPs63VnKlzdJhQ7QGB862jp07hcLyB_6iT8tdvYgK-uX4A5VNHqZRhv2Op0LXzCzxU0HNLvyqXLHoyFEUd9CRFqogRo7GhycpWrB-ORdEMSSBt-1g2Sv07rS8YKgmx6doO8RJn2U3f3Z6nwG-vJPMTw2sHImvrtqRmze-hORG1tcdUP6mzK7R735qumQHUMfyCG9J52XZJTsqyz7ktleDUyoGcYvVHVmrw9j-hkCNYvurxzYk0NL9Tg81kh6_KvId1Imdg5ptkXbneY_CwD3ePSAXWBDU09K38q4c35L8mmzonRMjMtB_xwphFMexXgRpeoM4gviSvWL_A8RD2ooI3yP3UDDNVmrU6X-gYFnwwmlFM5NLYQvfyAh6DrdFwiyF8AP812UIN3NMmEdwQHc0uK-5el53myJYaHtPL3Lgb1kR-aj3t2DAvF2SGkq8HHtLEQljRr7u8IXC5YOV_P8vGO89iWw3onlIc3HIQaODJ8B30cU1VkPuSh3PWULBXpWmAEOcrcmuze5jKLGLWHmCjI-SigOZEYTugmNt6ElhWHkgN1sXYNiy7bHNNz_qnV3NQ-dPJH2n6mZsO34dDI3U1YmsvuvTovdZxyFoC9wJXHSOwBgBPp2WTn-p1GyUz9ISfigKPyqicIJ3sIFwwT05C6pmQ54Rww15zms_40",
            email = "ziyu.ye@octo.com",
            tjm = 2000,
            niveau = "Senior Expert Manager"
        ),
        Consultant(
            id = "18",
            competences = listOf<String>(),
            nom = "TOP",
            prenom = "Tony",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocIPRDt8AJfsvgU_GmupyZ-dFGIGHZpYkKhKvUBfvDknUw",
            email = "tony.top@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "19",
            competences = listOf<String>(),
            nom = "SALA",
            prenom = "Alizee",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocJFqHihxrBjg2Fb26IwoYW43vHZZrXn_g0xWSl9IZD-1dyxlP8",
            email = "alizee.sala@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "20",
            competences = listOf<String>(),
            nom = "LEBERT",
            prenom = "Jasmine",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocJMBy8vl0zpICheRX_wK14sfM6bjI1ej5vPDk0ijwDb8psAwBo",
            email = "jasmine.lebert@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "21",
            competences = listOf<String>(),
            nom = "DORMOY",
            prenom = "Rémi",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLAnATrjmLO-gSMeepVtmnI3JTQMqBjPDCUwprIbSCN1w",
            email = "remi.dormoy@octo.com",
            tjm = 800,
            niveau = "Junior nooby"
        ),
        Consultant(
            id = "22",
            competences = listOf<String>(),
            nom = "VALLÉE",
            prenom = "Fabien",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocKueGHBZMaMLQDsYFYopiAcoWYBiC4RHPBGWbXitxUuHBLa80M",
            email = "fabien.vallee@octo.com",
            tjm = 500,
            niveau = "Développeur Apprenti"
        ),
        Consultant(
            id = "23",
            competences = listOf<String>(),
            nom = "LAURENT",
            prenom = "Nicolas",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocLDkYNpzIdLUKMkNITE9ePG4SKYAQxUxEaT4w2sx-A7cmo",
            email = "nicolas.laurent@octo.com",
            tjm = 0,
            niveau = "Stagiaire"
        ),
        Consultant(
            id = "24",
            competences = listOf<String>(),
            nom = "ADGEG",
            prenom = "Gabriel",
            photo = "https://lh3.googleusercontent.com/a/AEdFTp6c_vnog4JMF7O9cXiJW9iAqhRNLRvZmdkzo63B",
            email = "gabriel.adgeg@octo.com",
            tjm = 200,
            niveau = "Alternant"
        ),
        Consultant(
            id = "25",
            competences = listOf<String>(),
            nom = "DEGAND",
            prenom = "Pierre",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocJOgW3Qzf0raMi-zn-c_HXq0AdcpdB0adrx10F1bglr8Iw",
            email = "pierre.degand@octo.com",
            tjm = 500,
            niveau = "Développeur Apprenti"
        ),
        Consultant(
            id = "26",
            competences = listOf<String>(),
            nom = "MILLARD",
            prenom = "Frédéric",
            photo = "https://lh3.googleusercontent.com/a/ACg8ocJBVLTDmk-HJD1A86IAcd4JKesY0mZubXgftPQdOIaHpMM",
            email = "frederic.millard@octo.com",
            tjm = 200,
            niveau = "Alternant"
        )
    )
}

data class Consultant(
    val id: String,
    val nom: String,
    val prenom: String,
    val niveau: String,
    val email: String,
    val tjm: Int,
    val photo: String,
    val competences: List<String>
)
