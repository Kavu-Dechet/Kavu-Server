
## Configuration
```bash
pip install -r requirements.txt -v
```

## Usage
```python
#Get all dechets
curl http://localhost:5000/dechet/
# Post dechets position
curl -d "latitude=42&longitude=43&categorie=bite" -X POST "http://localhost:5000/dechet/"
```