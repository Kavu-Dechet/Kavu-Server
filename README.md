# Pikachu Server

## Details
Server used for the awesome Kavu Dechet projet

All servers actions (set up & Maintenance) must be delt with ansible, this way we can ensure consistency and resilience.

## Set up

```bash
cd ansible
ansible-playbook ansible/install.playbook.yml -i ansible/inventories/pikachu.yml
```

=> Opened ports [doc](https://gist.github.com/ymougenel/85e50ca15cfeab441774361c73ba6e0f#open-ports)
__TODO__: open port via ansible

## Maintenance
