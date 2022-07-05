package com.example.starwarsfiguren



    class Datasource() {
         fun loadFiguren():List<Figuren>{


        return listOf(
            Figuren(
                "Darth Vader",
                49.99,
                R.drawable.darthvader,
                false

            ),
            Figuren(
                "Mando",
                39.99,
                R.drawable.mando,
                false

            ),

            Figuren(
                "Sturm Truppler",
                10.00,
                R.drawable.sturmtruppler,
                false

            ),

            Figuren(
                "Trio ",
                20.00,
                R.drawable.trio,
                false

            ),

            Figuren(
                "Ewok Wicked",
                30.00,
                R.drawable.ewok_wicked,
                true

            ),

            Figuren(
                "Chewbacca",
                12.00,
                R.drawable.Chewbacca,
                true
            )
        )
    }
}



