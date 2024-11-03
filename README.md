# Kavu Dechet Server

## Details
Server used for the awesome Kavu Dechet projet

All servers action (set up & Maintenance) must be delt with ansible, this way we can ensure consistency and resilience.

## Set up

### Install
```bash
cd ansible
ansible-playbook ansible/install_playbook.yml -i ansible/inventories/server.yml
```

### Docker vs Podman
Issue encountered with podman -> [désintallation de podman et installation de docker](https://www.linuxtechi.com/install-docker-ce-centos-8-rhel-8/)
