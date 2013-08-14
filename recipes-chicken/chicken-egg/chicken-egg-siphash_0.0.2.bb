SECTION = "devel/chicken"
DESCRIPTION = "The SipHash family of hash functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://siphash.meta;md5=81c999501bf0043c95c70dbaebd74bda"
DEPENDS_virtclass-cross += "chicken-egg-numbers-cross"
DEPENDS += "chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} += "chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "08cb734cbe408fe98d71f828f89a07e3"
SRC_URI[sha256sum] = "ab48ec26c4e604bd60ff132d94966da66b94d9687d2f8dbc6729377d6855e5ab"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
