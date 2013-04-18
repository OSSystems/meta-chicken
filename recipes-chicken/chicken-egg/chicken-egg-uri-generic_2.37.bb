SECTION = "devel/chicken"
DESCRIPTION = "URI generic syntax (RFC 3986) parsing and manipulation."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-generic.meta;md5=1b38ce87b80c8a88fa97bc45a01802e4"
DEPENDS_virtclass-cross += "chicken-egg-matchable-cross chicken-egg-defstruct-cross"
DEPENDS += "chicken-egg-matchable chicken-egg-defstruct chicken-egg-matchable-cross chicken-egg-defstruct-cross"
RDEPENDS_${PN} += "chicken-egg-matchable chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "02b16b3a05c66952ee9c868b3d9c5dc4"
SRC_URI[sha256sum] = "0292e3be23223e55faa3a576e7b38bcb2d27ed58c39766dabdb42a4e0ecafe3e"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
