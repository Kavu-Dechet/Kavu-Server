from flask import Flask, jsonify, request
import crud_persistence

app = Flask(__name__)


@app.route('/dechet/', methods=['POST'])
def create_dechet():
    # On recupere le corps (payload) de la requete
    payload = request.form.to_dict()
    result = crud_persistence.insert_dechet(**payload)

    if result:
        return jsonify(status='True', message='Dechet created')
    return jsonify(status='False')


@app.route('/dechet/', methods=['GET'])
def get_all_dechets():
    result = crud_persistence.query_all_dechets()
    if result:
        return jsonify(status="True",
                       result=[
                           {"id": dechet[0],
                            "latitude": dechet[1],
                            "longitude": dechet[2],
                            "ville": dechet[3]} for dechet in result])
    return jsonify(status="False")


if __name__ == '__main__':
    print("Hello from API")
    crud_persistence.init()
    app.run(host='0.0.0.0', port=5000, debug=True)
