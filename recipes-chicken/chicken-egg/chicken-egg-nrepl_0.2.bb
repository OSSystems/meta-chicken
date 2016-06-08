SECTION = "devel/chicken"
DESCRIPTION = "Simple networked REPL over TCP"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://nrepl.meta;md5=e86f19d25d9bc8e2ff1c5520f7ad219b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/nrepl/nrepl-${PV}.tar.gz"

SRC_URI[md5sum] = "b08e7c0043f1de3a79466a370d66020d"
SRC_URI[sha256sum] = "1dfad163da81d733f8a011aef6d7722b2682fce75f575eae51684f8b6e8da919"

S = "${WORKDIR}/nrepl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
