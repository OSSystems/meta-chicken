SECTION = "devel/chicken"
DESCRIPTION = "Coroutines and Finite State Machines"
LICENSE = "3 Clause BSD"
LIC_FILES_CHKSUM = "file://cooperative.meta;md5=2cced87390ed06d77948f22079f3cf6f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cooperative/cooperative-${PV}.tar.gz"

SRC_URI[md5sum] = "a1ad2de0851dbac98e8fa2533f1aeac4"
SRC_URI[sha256sum] = "d081047aa4df54764a215f2f01130cbbdfef1ccee2d92b534a6c035f3c6ddbcd"

S = "${WORKDIR}/cooperative-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
