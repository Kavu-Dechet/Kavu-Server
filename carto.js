var map = L.map('map').setView([-12.809645, 45.130741], 13);
const accessToken = 'F8J6gLZ8REbN2Z8OEeTqpIxYiBC2XxumJb3TpcXBR87lreXYlXI6innPPFyzBlaw';
L.tileLayer(
  `https://tile.jawg.io/jawg-sunny/{z}/{x}/{y}.png?access-token=${accessToken}`, {
    attribution: '<a href="http://jawg.io" title="Tiles Courtesy of Jawg Maps" target="_blank" class="jawg-attrib">&copy; <b>Jawg</b>Maps</a> | <a href="https://www.openstreetmap.org/copyright" title="OpenStreetMap is open data licensed under ODbL" target="_blank" class="osm-attrib">&copy; OSM contributors</a>',
    maxZoom: 22
  }
).addTo(map);


//https://api.jawg.io/styles/jawg-sunny.html?access-token=F8J6gLZ8REbN2Z8OEeTqpIxYiBC2XxumJb3TpcXBR87lreXYlXI6innPPFyzBlaw&lang=fr&raster=true#15/43.5982/1.4365
