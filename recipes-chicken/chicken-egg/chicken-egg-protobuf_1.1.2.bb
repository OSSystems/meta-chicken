SECTION = "devel/chicken"
DESCRIPTION = "Protocol buffer serialization"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://protobuf.meta;md5=24d198a4f4a341329d6971be1385a8ff"
DEPENDS_virtclass-cross += "chicken-egg-srfi-42-cross chicken-egg-srfi-4-comprehensions-cross chicken-egg-srfi-99-cross chicken-egg-numbers-cross"
DEPENDS += "chicken-egg-srfi-42 chicken-egg-srfi-4-comprehensions chicken-egg-srfi-99 chicken-egg-numbers chicken-egg-srfi-42-cross chicken-egg-srfi-4-comprehensions-cross chicken-egg-srfi-99-cross chicken-egg-numbers-cross chicken-egg-protobuf-cross"
RDEPENDS_${PN} += "chicken-egg-srfi-42 chicken-egg-srfi-4-comprehensions chicken-egg-srfi-99 chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "476d93934b51365442d9a0c393bf3f52"
SRC_URI[sha256sum] = "b1b1b4e9cd799f3e1a168590304ab4fa2d7e6ec68f27daf3306e36998b9a5f6b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
