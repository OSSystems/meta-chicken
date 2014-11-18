SECTION = "devel/chicken"
DESCRIPTION = "The SipHash family of hash functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://siphash.meta;md5=81c999501bf0043c95c70dbaebd74bda"
DEPENDS_virtclass-cross += "chicken-egg-numbers-cross"
DEPENDS += "chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} += "chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "a1700a607b67ecb3301bef86dda61eb3"
SRC_URI[sha256sum] = "dfd8c91db407a75e4f0f358a4faa792b0c4232cfff7fabb036e41ab407b8931a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
