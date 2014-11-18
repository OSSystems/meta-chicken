SECTION = "devel/chicken"
DESCRIPTION = "An SCSS emitter with extensions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scss.meta;md5=2724888d59f2cef9f81498bd10ac4dbe"
DEPENDS_virtclass-cross += "chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-matchable chicken-egg-matchable-cross chicken-egg-scss-cross"
RDEPENDS_${PN} += "chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "dec37570bdf0da44eb31bf5ca98e9f23"
SRC_URI[sha256sum] = "a13dd4032113f90d8be57b55f65bf64ca9d401ef190067d70fbe1582576cc6a2"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
