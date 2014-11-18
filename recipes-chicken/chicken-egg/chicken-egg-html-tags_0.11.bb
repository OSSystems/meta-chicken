SECTION = "devel/chicken"
DESCRIPTION = "Procedures to generate [X]HTML code"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-tags.meta;md5=23c93fa675a35ef527682a16e8cb7594"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "edc4e3f206ba71a94f89a052759c9582"
SRC_URI[sha256sum] = "e4a2f68ac5394b3e080e1a1a9a86e149bcb29ae8aeb476adf391d9bd84ee646b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
