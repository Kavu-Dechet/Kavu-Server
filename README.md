# Pikachu Server

## Details
Server used for the awesome Kavu Dechet projet

All servers actions (set up & Maintenance) must be delt with ansible, this way we can ensure consistency and resilience.

## Set up

### Install
```bash
cd ansible
ansible-playbook ansible/install.playbook.yml -i ansible/inventories/pikachu.yml
```
### Ports
=> Opened ports [doc](https://gist.github.com/ymougenel/85e50ca15cfeab441774361c73ba6e0f#open-ports)
* 5533 (Database)
__TODO__: open port via ansible

### Docker vs Podman
Problèmes rencontrés avec podman, pas envie de me prendre la tete -> [désintallation de podman et installation de docker](https://www.linuxtechi.com/install-docker-ce-centos-8-rhel-8/)
## Maintenance
