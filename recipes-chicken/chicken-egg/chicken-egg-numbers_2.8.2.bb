SECTION = "devel/chicken"
DESCRIPTION = "Full numeric tower support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://numbers.meta;md5=69d1df76a955d24a5eca39aa3cfa723d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "ed24e810014807481e17775393a650f4"
SRC_URI[sha256sum] = "e24bfa56dc7d7ee9a705674a23203653817a7d5bca4da947cda6d44c51fa8318"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
