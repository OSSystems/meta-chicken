SECTION = "devel/chicken"
DESCRIPTION = "Secure password hashing through the Unix crypt() function"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://crypt.meta;md5=fed18e44b5d9d5abf1ab1d7aae2b8c1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "128e180a6aa80d425c6ec90be0a41db9"
SRC_URI[sha256sum] = "1762bee682ee51032185d800fa241bde49d1575814207d4e6275d65dbe3d38be"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
