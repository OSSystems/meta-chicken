SECTION = "devel/chicken"
DESCRIPTION = "evaluating expressions just once"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://latch.meta;md5=5656f3e9826aa6c3ac4859ed2571475c"
DEPENDS_class-cross += "chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} += "chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "2ece73263861062d1e589f623b26f3f1"
SRC_URI[sha256sum] = "7bd4d94acfe662321d83157326adadff498b95dce18786ec4a5116339b7c1ac8"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
