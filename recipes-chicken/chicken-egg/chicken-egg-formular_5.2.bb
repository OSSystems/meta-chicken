SECTION = "devel/chicken"
DESCRIPTION = "Process CGI email forms."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://formular.meta;md5=ee107da694374aa612a4cad94c85d5d3"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-rb-tree-cross chicken-egg-abnf-cross chicken-egg-mbox-cross chicken-egg-internet-message-cross chicken-egg-ssax-cross chicken-egg-getopt-long-cross chicken-egg-fmt-cross chicken-egg-utf8-cross chicken-egg-byte-blob-stream-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-rb-tree-crosssdk chicken-egg-abnf-crosssdk chicken-egg-mbox-crosssdk chicken-egg-internet-message-crosssdk chicken-egg-ssax-crosssdk chicken-egg-getopt-long-crosssdk chicken-egg-fmt-crosssdk chicken-egg-utf8-crosssdk chicken-egg-byte-blob-stream-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-input-classes nativesdk-chicken-egg-rb-tree nativesdk-chicken-egg-abnf nativesdk-chicken-egg-mbox nativesdk-chicken-egg-internet-message nativesdk-chicken-egg-ssax nativesdk-chicken-egg-getopt-long nativesdk-chicken-egg-fmt nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-byte-blob-stream chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-rb-tree-crosssdk chicken-egg-abnf-crosssdk chicken-egg-mbox-crosssdk chicken-egg-internet-message-crosssdk chicken-egg-ssax-crosssdk chicken-egg-getopt-long-crosssdk chicken-egg-fmt-crosssdk chicken-egg-utf8-crosssdk chicken-egg-byte-blob-stream-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-rb-tree chicken-egg-abnf chicken-egg-mbox chicken-egg-internet-message chicken-egg-ssax chicken-egg-getopt-long chicken-egg-fmt chicken-egg-utf8 chicken-egg-byte-blob-stream chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-rb-tree-cross chicken-egg-abnf-cross chicken-egg-mbox-cross chicken-egg-internet-message-cross chicken-egg-ssax-cross chicken-egg-getopt-long-cross chicken-egg-fmt-cross chicken-egg-utf8-cross chicken-egg-byte-blob-stream-cross chicken-egg-formular-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-rb-tree chicken-egg-abnf chicken-egg-mbox chicken-egg-internet-message chicken-egg-ssax chicken-egg-getopt-long chicken-egg-fmt chicken-egg-utf8 chicken-egg-byte-blob-stream"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/formular/formular-${PV}.tar.gz"

SRC_URI[md5sum] = "81f3e42e3b39b1a65749d78d9a55ae6e"
SRC_URI[sha256sum] = "164a98a78ad9f78a068d624f651942043da34c66ef653344d8e9965ca88e7a0e"

S = "${WORKDIR}/formular-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
